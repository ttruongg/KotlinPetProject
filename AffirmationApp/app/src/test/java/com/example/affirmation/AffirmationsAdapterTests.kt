package com.example.affirmation

import android.content.Context
import com.example.affirmation.adapter.ItemAdapter
import com.example.affirmation.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {
    private val context = mock(Context::class.java)


    //this function make sure that the size of adapter is the size of the list
    @Test
    fun adapter_size(){
        val data = listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)

        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }

}