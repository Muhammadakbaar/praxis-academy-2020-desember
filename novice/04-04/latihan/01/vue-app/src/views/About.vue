<template>
  <div class="about">
    <img alt="Vue logo" src="../assets/logo.png">
    <About msg="Welcome to About page"/>
  </div>
</template>

<script>
// @ is an alias to /src
import About from '@/components/About.vue'

export default {
  name: 'about',
  components: {
    About
  }
}
</script>
