<template>
  <div id="app">
    <img src="./assets/logo.png">
    <router-view/>
  </div>
</template>

<script>
  export default {
    name: 'App'
    ,
    mounted: function () {
      var LeanCloud = require('leancloud-storage');
      LeanCloud.init({
        appId: 'AHGoaHR43LXXAW1YrIel4yji-gzGzoHsz',
        appKey: 'Ilrt2qgHz8UGbWhVhaaIgPjd'
      });
    }
  }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
