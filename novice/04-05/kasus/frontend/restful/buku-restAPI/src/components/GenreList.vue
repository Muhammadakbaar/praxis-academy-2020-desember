<template>
  <div>
    <h4 v-if="loading">Loading...</h4>
    <button class="button field is-small is-danger" @click="checkedRows = []"
        :disabled="!checkedRows.length">
        <b-icon icon="close"></b-icon>
        <span>Clear checked</span>
    </button>
    <button class="button is-small is-danger" @click.prevent="onDelete" title="Delete checked" :disabled="!checkedRows.length">Delete</button>

    <b-field grouped group-multiline>                      
        <b-select v-model="perPage" :disabled="!isPaginated" size="select is-small">
            <option value="5">5 per page</option>
            <option value="10">10 per page</option>
            <option value="15">15 per page</option>
            <option value="20">20 per page</option>
        </b-select>
        <!-- <div class="control">
            <button class="button is-small" @click="currentPage = 2" :disabled="!isPaginated">Set page to 2</button>
        </div> -->
        <div class="control is-flex">
            <b-switch v-model="isPaginated" size="is-small">Paginated</b-switch>
        </div>
        <div class="control is-flex">
            <b-switch v-model="isPaginationSimple" :disabled="!isPaginated" size="is-small">Simple pagination</b-switch>
        </div>

        
    </b-field>
    
    <b-field grouped group-multiline>
      <form @submit="formSubmit">
        <b-field>
          <b-input v-model="name"
            placeholder="Add genre"
            type="text"
          />
          <b-button tag="input"
            native-type="submit"
            value="Add genre"
          />  
        </b-field>
      </form>    
    </b-field>

    <b-table
        :data="allGenres"
        :paginated="isPaginated"
        :per-page="perPage"
        :current-page.sync="currentPage"
        :pagination-simple="isPaginationSimple"
        :default-sort-direction="defaultSortDirection"
        default-sort="created_at"
        :checked-rows.sync="checkedRows"
        :is-row-checkable="(row) => row.id !== null"
        checkable>

        <template slot-scope="props">
            <b-table-column field="id" label="ID" width="40" sortable numeric>
                <small>{{ props.row.id }}</small>
            </b-table-column>

            <b-table-column field="name" label="Genre" sortable>
                <small>{{ props.row.name }}</small>
            </b-table-column>

            

            <b-table-column field="id" label="Actions" numeric>
                <button class="is-small button is-danger" @click.prevent="onDeleteSingle(props.row.id)" title="Delete Data" >Delete Data</button>
            </b-table-column>

        </template>
    </b-table>
</div>
</template>

<script>
import axios from 'axios'
  export default {
    name: 'GenreList',
    data () {
      return {         
            allGenres: [],
            loading: 0,
            errors: [],
            isPaginated: true,
            isPaginationSimple: false,
            defaultSortDirection: 'asc',
            currentPage: 1,
            perPage: 5,
            checkedRows: [],
            output: '',
            name:''

        }
    },
    created() {
        axios.get('http://localhost:8080/genres/list')
             .then(response => {
                this.allGenres = response.data  
             })
             .catch(e => {
                this.errors.push(e)
             })
    }, 
    methods: {
        onDelete() {
          
          axios.delete('http://localhost:8080/genres/' + this.checkedRows.map(a=>a.id))
              .then((response) => {
                  this.allGenres = response.data
                  alert("Data berhasil dihapus")
                  location.reload();
              }, (error) => {
                  console.log(error)
          })
        },
        onDeleteSingle(a) {
          axios.delete('http://localhost:8080/genres/' + a)
              .then((response) => {
                  this.allGenres = response.data
                  alert("Data berhasil dihapus")
                  location.reload();
              }, (error) => {
                  console.log(error)
          })
        },
        formSubmit(e) {
          e.preventDefault();
          axios.post('http://localhost:8080/genres', {
              name: this.name,
              
          })
          .then(function (response) {
              
              alert("Data berhasil ditambah")
              
              location.reload();
          })
          .catch(function (error) {
              console.log(error)
          });
        },
    },
    components: {
      
    },

  }
</script>

<style>
  
</style>