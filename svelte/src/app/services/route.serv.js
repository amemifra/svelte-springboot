import { writable, readable } from 'svelte/store';

export const hash = writable('');

hashSetter();

window.onhashchange = () => hashSetter()

function hashSetter() {
  hash.set(
    location.hash.length >= 2 
    ? location.hash.substring(2) 
    : ''
  );
}

