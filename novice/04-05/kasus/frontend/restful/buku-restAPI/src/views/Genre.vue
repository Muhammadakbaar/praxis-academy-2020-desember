<template>
  <div>
    <GenreList
      
      />
  </div>
</template>

<script>
import GenreList from '@/components/GenreList.vue'

  export default {

    name: 'genre',
    data () {
      return {          
            allGenres: [],  
            
                    
            
        }
    },
    
    components: {
      GenreList
    },

  }
</script>

<style>
  
</style>