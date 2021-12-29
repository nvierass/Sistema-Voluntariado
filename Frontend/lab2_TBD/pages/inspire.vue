<template>
  <v-row>
    <v-col class="text-center">
      <img
        src="/v.png"
        alt="Vuetify.js"
        class="mb-5"
      >
      <blockquote class="blockquote">
        &#8220;LA PARRILLA.&#8221;
        <footer>
          <small>
            <input v-model="message" placeholder="edíteme">
            <p>El mensaje es: {{ message }}</p>
          </small>
        </footer>
      </blockquote>
    </v-col>
  </v-row>
</template>

<script>
export default {
  name: 'InspirePage'
}
</script>
