<template>
  <div class="hero">
    {{users}}
  </div>
</template>

<script>
import axios from 'axios'
export const RUTA_SERVIDOR = process.env.VUE_APP_API

export default {
  name: 'ApiTest',
  data() {
    return {
      users: 'null',
    };
  },
  created: function() {
    console.log(process.env.VUE_APP_API)
    axios
        .get(RUTA_SERVIDOR + 'greeting')
        .then(res => {
            this.users = res.data
        })
    }
}
</script>



<style>
.hero {
  font-size: 30px;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}
</style>
