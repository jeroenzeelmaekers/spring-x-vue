<template>
	<div>
		<AppNavigation class="navigation" />
		<NotePage class="notepage" />
	</div>
</template>

<script>
import AppNavigation from '@/components/AppNavigation'
import NotePage from '@/pages/NotePage'

export default {
	name: 'App',
	components: {
		AppNavigation,
		NotePage,
	},
}
</script>

<style>
* {
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}

#app {
	font-family: Avenir, Helvetica, Arial, sans-serif;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
	color: #2c3e50;
}

.navigation {
	position: fixed;
	top: 0;
}

.notepage {
	margin: 4rem 0rem;
	width: 100vw;
	height: 100vh;
}
</style>
