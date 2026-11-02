package sa.factory.injazcareservices.model

import kotlinx.serialization.Serializable

@Serializable
data class InjazCareItem(
    val id: String,
    val title: String,
    val description: String,
    val priceSar: String,
    val badge: String = "معتمد"
)

@Serializable
data class InjazCareOrder(
    val requestId: String,
    val items: List<InjazCareItem>,
    val status: String = "ACTIVE"
)
