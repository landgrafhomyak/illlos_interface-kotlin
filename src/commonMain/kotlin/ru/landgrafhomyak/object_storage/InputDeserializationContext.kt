package ru.landgrafhomyak.object_storage


interface InputDeserializationContext {
    fun getValue(fieldNo: UInt): ULong
    fun <T:Any> getObjectReference(fieldNo: UInt, descriptor: ObjectDescriptor<T>): ObjectReference<T>
    fun <T:Any> getCollectionReference(fieldNo: UInt, elementDescriptor: ObjectDescriptor<T>): CollectionReference<T>
}