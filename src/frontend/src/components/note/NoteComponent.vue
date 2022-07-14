<template>
	<div class="note">
		<p class="note__content">{{ note.content }}</p>
		<p class="note__author">{{ note.author.firstName }} {{ note.author.lastName }}</p>
	</div>
</template>

<script>
export default {
	name: 'NoteComponent',
	props: {
		note: {
			id: Number,
			content: String,
			author: {
				id: Number,
				firstName: String,
				lastName: String,
			},
		},
	},
}
</script>

<style scoped>
.note {
	background-color: rgba(240, 240, 240, 1);
	padding: 1rem;
	margin: 0.3rem;
	border-radius: 0.4rem;
	display: flex;
	width: 100%;
	justify-content: space-between;
}

.note__content {
	word-wrap: break-word;
}

.note__author {
	min-width: 10rem;
	padding-left: 1rem;
	align-self: flex-end;
	text-align: end;
}
</style>
