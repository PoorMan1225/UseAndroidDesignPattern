package com.rjhwork.mycompany.adapterpattern.location

class CustomerLocation(
    override val floor: Int,
    override val desk: String,
    override val building: String,
    override val office: String
) : OldLocation