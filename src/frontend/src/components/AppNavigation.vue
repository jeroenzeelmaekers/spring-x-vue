<template>
	<nav class="navigation">
		<p class="title">Note's List</p>
		<div class="menu">
			<button class="menu__item">Add Author</button>
			<button class="menu__item">Add Note</button>
		</div>
	</nav>
</template>

<script>
export default {
	name: 'AppNavigation',
}
</script>

<style scoped>
.navigation {
	background: rgba(250, 250, 250, 1);
	display: flex;
	width: 100%;
	justify-content: space-between;
}

.title {
	margin: 0.5em;
	font-size: 1.4em;
	font-weight: 600;
}

.menu {
	display: flex;
}

.menu__item {
	background: transparent;
	border: none;
	font-weight: 500;
	font-size: 1em;
	padding: 0rem 1rem;
}

.menu__item:hover {
	background: rgba(240, 240, 240, 1);
}
</style>
