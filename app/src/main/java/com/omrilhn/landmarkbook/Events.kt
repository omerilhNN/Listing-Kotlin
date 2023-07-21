package com.omrilhn.landmarkbook

import java.io.Serializable

//Serilazable to serialize this classes variables

class Events(val name:String, val details:String, val image: Int) : Serializable {
}