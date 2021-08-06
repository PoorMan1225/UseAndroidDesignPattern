package com.rjhwork.mycompany.adapterpattern.adapter

import com.rjhwork.mycompany.adapterpattern.location.NewLocation
import com.rjhwork.mycompany.adapterpattern.location.OldLocation

// Adapter 를 통해서 기존 로케이션에서
// 신규 로케이션으로 변경할 수 있게 한다.
class Adapter(oldLocation: OldLocation) :
    NewLocation {

    override var floor: Int = oldLocation.floor
    override var desk: String = oldLocation.desk
    override var building: String = oldLocation.building
}