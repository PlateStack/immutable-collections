[immutable-collections](../index.md) / [org.platestack.structure.immutable](index.md) / [immutableSetOf](.)

# immutableSetOf

`fun <E> immutableSetOf(): `[`ImmutableSet`](-immutable-set.md)`<E>`

Returns a shared empty set. The returned set is serializable.

`fun <E> immutableSetOf(element: E): `[`ImmutableSet`](-immutable-set.md)`<E>`

Returns a singleton set. The returned set is serializable.

`fun <E> immutableSetOf(vararg elements: E): `[`ImmutableSet`](-immutable-set.md)`<E>`

Returns a set of given elements. Elements of the set are iterated in the order they were specified.
The returned set is serializable.

