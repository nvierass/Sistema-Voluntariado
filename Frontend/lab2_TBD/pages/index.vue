<template>
    <div>
        <h1 class = "centerA"> Plataforma de Gestion de Voluntarios para emergencias</h1>
        <figure>
            <img src="/red_vol.jpeg" class="centerB" height=" 400px">    
        </figure>

    </div>
  
</template>

<script>
import Navigation from "../components/Navigation.vue";

export default {
    components: {
        Navigation
    },
    name: "IndexPage",
    head() {
        return {
            title: "Gestión de Voluntariado | Home",
        };
    }
   
};
</script>

<style>

.centerA {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 65%;
}

.centerB {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 45%;
}

</style>