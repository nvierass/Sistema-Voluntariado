<template>
    <div>
        <Navigation/>
        <Nuxt />
    </div>
</template>

<script>
import Navigation from "../components/Navigation.vue";

export default {
    components: {
        Navigation
    }
};
</script>

<style>
* {
    box-sizing: border-box;
    color: whitesmoke;

}

    body {
        background: #2d3436;
        color:whitesmoke;
        font-family: Arial, Helvetica, sans-serif;
        padding-top: 0;
    }

    .content {  
        padding: 2rem;
    }
</style>