<template>
    <nuxt-link :to="'/tareas/'+id_tarea">
        <div class="tarea">
            <p>{{index}}. {{nombre}} - {{descripcion}}</p>
        </div>
    </nuxt-link>
</template>
<script>
export default{
    name: 'Tarea',
    props: ['index','id_tarea', 'nombre','descripcion']
}
</script>

<style>
    .tarea{
        padding: 1rem;
        border: 1px solid whitesmoke;
        margin: 1rem 0;
    }

    .tarea:hover {
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