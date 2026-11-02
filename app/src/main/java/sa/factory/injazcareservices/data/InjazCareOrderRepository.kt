package sa.factory.injazcareservices.data

import sa.factory.injazcareservices.model.InjazCareItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class InjazCareOrderRepository {
    private val _catalog = MutableStateFlow(listOf(
        InjazCareItem("1", "الباقة التنفيذية المعتمدة", "تكامل مباشر مع Mada Contactless EMV L2 NFC + GPS Dispatch", "180 ر.س", "معتمد"),
        InjazCareItem("2", "خدمة المعالجة الفورية", "أداء أصيل بسرعة 60 إطار في الثانية", "95 ر.س", "فوري"),
        InjazCareItem("3", "باقة الصيانة والدعم السحابي", "تشفير كامل للبيانات المحلية ومزامنة آمنة", "250 ر.س", "شامل")
    ))
    val catalog: Flow<List<InjazCareItem>> = _catalog.asStateFlow()
}
