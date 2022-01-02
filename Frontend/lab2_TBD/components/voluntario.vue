<template>
    <nuxt-link :to="'/voluntarios/'+id_voluntario">
        <div class="voluntario" v-if="!inscrito">
            <p>{{index}}. {{nombre}}</p>
        </div>
        <div class= "voluntario" v-if="inscrito">
            <p>{{index}}. Nombre: {{nombre}}</p>
            <p>Edad: {{edad}}</p>
            <p>RUN: {{rut}}</p>
            <p>Región: {{region}}</p>
            <p>Ciudad: {{ciudad}}</p>
        </div>
    </nuxt-link>
</template>
<script>
export default{
    name: 'Voluntario',
    props: ['index','id_voluntario', 'nombre', 'inscrito','rut','region','ciudad','edad']
} 
</script>

<style>
    .voluntario{
        padding: 1rem;
        border: 1px solid whitesmoke;
        margin: 1rem 0;
    }

    .voluntario:hover {
        background: #2d3436;
        border: 1px solid #6c5ce7;
        cursor: pointer;
    }

    a{
        color: whitesmoke;
        text-decoration: none;
    }

    a:hover{
        color:#6c5ce7;
    }

</style>