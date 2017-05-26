[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableMap](index.md) / [ceilingEntry](.)

# ceilingEntry

`abstract fun ceilingEntry(key: K): Entry<K, V>?`

Returns a key-value mapping associated with the least key
greater than or equal to the given key, or `null` if
there is no such key.

### Parameters

`key` - the key

### Exceptions

`ClassCastException` - if the specified key cannot be compared
    with the keys currently in the map

`NullPointerException` - if the specified key is null
    and this map does not permit null keys

**Return**
an entry with the least key greater than or equal to
    `key`, or `null` if there is no such key

