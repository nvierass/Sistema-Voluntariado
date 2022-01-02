<template>
    <div>
        <h1>Aplicación de prueba para laboratorio</h1>
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
