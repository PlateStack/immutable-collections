[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableMap](index.md) / [floorEntry](.)

# floorEntry

`abstract fun floorEntry(key: K): Entry<K, V>?`

Returns a key-value mapping associated with the greatest key
less than or equal to the given key, or `null` if there
is no such key.

### Parameters

`key` - the key

### Exceptions

`ClassCastException` - if the specified key cannot be compared
    with the keys currently in the map

`NullPointerException` - if the specified key is null
    and this map does not permit null keys

**Return**
an entry with the greatest key less than or equal to
    `key`, or `null` if there is no such key
