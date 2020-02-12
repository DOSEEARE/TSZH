package mainactivity.musicplayer.example.com.expendelrecyclerview

import android.os.Parcel
import android.os.Parcelable

class Product : Parcelable {
    val name: String?

    constructor(name: String) {
        this.name = name
    }

    protected constructor(`in`: Parcel) {
        name = `in`.readString()
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, i: Int) {
        parcel.writeString(name)
    }

    companion object CREATOR : Parcelable.Creator<Product> {
        override fun createFromParcel(parcel: Parcel): Product {
            return Product(parcel)
        }

        override fun newArray(size: Int): Array<Product?> {
            return arrayOfNulls(size)
        }
    }
}
