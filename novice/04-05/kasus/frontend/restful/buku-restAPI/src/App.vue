<template>
  <div id="app">
    <div id="nav">
      <b-navbar type="is-dark">
        <template slot="brand">
            <b-navbar-item tag="router-link" :to="{ path: '/' }">
                <img
                    src="@/assets/logo.png"
                    alt="Praxis Academy"
                >
            </b-navbar-item>
        </template>
        <template slot="start">
            <b-navbar-item tag="router-link" :to="{ path: '/' }">
                Home
            </b-navbar-item>
            <b-navbar-item href="#">
                Documentation
            </b-navbar-item>
            <b-navbar-dropdown label="Data Master">
                <b-navbar-item tag="router-link" :to="{ path: '/genre'}">
                    Genre
                </b-navbar-item>
                <b-navbar-item href="#">
                    Book
                </b-navbar-item>
            </b-navbar-dropdown>
        </template>

        <template slot="end">
            <b-navbar-item tag="div">
                <div class="buttons">
                    <a class="button is-light is-inverted">
                        <strong>Sign up</strong>
                    </a>
                    <a class="button is-light is-inverted">
                        Log in
                    </a>
                </div>
            </b-navbar-item>
        </template>
    </b-navbar>
    </div>
    
    <div id="content" class="container">
        
          
            <router-view/>
          
        
    </div>
    
  </div>
</template>

<style lang="scss">
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#nav {
  
  a {
    font-weight: bold;
  
    &.router-link-exact-active {
      color: rgb(187, 187, 187);
    }
  }
}

#content {
  text-align: center;
  padding-top: 50px;
}

</style>
