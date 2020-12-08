<template>
  <div class="about">
    <h1>{{ msg }}</h1>
    <a class="button" href="/">Home</a>
    <a class="button" href="/about">About</a>
    <a class="button" href="/coba">Coba</a>
  </div>
</template>

<script>
export default {
  name: 'About',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
