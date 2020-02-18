package com.example.tsj.adapters.pesonal

import com.example.tsj.R
import com.example.tsj.model.PersonalModel

class PersonalSource {

    companion object{
        fun personalDtaSet(): ArrayList<PersonalModel>{
            val list = ArrayList<PersonalModel>()
            list.add(PersonalModel("641.52","01/12/2019", R.drawable.ic_save))
            list.add(PersonalModel("641.52","01/12/2019", R.drawable.ic_save))
            list.add(PersonalModel("641.52","01/12/2019", R.drawable.ic_save))
            list.add(PersonalModel("620.83","31/12/2019", R.drawable.ic_save))
            list.add(PersonalModel("620.83","31/12/2019", R.drawable.ic_save))
            list.add(PersonalModel("620.83","31/12/2019", R.drawable.ic_save))
            list.add(PersonalModel("620.83","31/12/2019", R.drawable.ic_save))
            list.add(PersonalModel("620.83","31/12/2019", R.drawable.ic_save))
            list.add(PersonalModel("20.72","02/02/2020", R.drawable.ic_save))
            list.add(PersonalModel("20.72","02/02/2020", R.drawable.ic_save))
            list.add(PersonalModel("20.72","02/02/2020", R.drawable.ic_save))
            list.add(PersonalModel("20.72","02/02/2020", R.drawable.ic_save))

            return list
        }
    }
}