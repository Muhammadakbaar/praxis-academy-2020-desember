<template>
    <div class="coba">
        <h1>{{msg}}</h1>
        <a class="button" href="/">Home</a>
        <a class="button" href="/about">About</a>
        <a class="button" href="/coba">Coba</a>     
    </div>
</template>

<script>
export default {
    name: 'Coba',
    props: {
        msg: String
  }
}
</script>
