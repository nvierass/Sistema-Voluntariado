<template>
    <div class= "voluntario">
        <p>{{index}}. Nombre: {{nombre}}</p>
        <p>RUT: {{rut}}</p>
        <p v-if='aceptado'>Aceptado para participar</p>
        <p v-if='!aceptado'>Aún no se ha aceptado para participar</p>
    </div>
</template>
<script>
export default{
    name: 'Voluntario',
    props: ['index','nombre', 'aceptado','rut']
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
</style>