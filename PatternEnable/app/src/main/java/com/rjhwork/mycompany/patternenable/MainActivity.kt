package com.rjhwork.mycompany.patternenable

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.rjhwork.mycompany.patternenable.adapter.DataAdapter
import com.rjhwork.mycompany.patternenable.filling.*
import com.rjhwork.mycompany.patternenable.util.ItemDivider

class MainActivity : AppCompatActivity() {

    private val recyclerView: RecyclerView by lazy {
        findViewById(R.id.recyclerView)
    }

    private val adapter = DataAdapter()

    private val cheese: List<Cheese> = listOf(
        Cheddar(),
        Camembert(),
        Gouda(),
        Manchego(),
        Roquefort(),
        Brie(),
        Emmental()
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        initRecyclerView()
        initItemTouchHelper()
        initAction()
    }

    private fun initAction() {
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        buildDialog(fab)
    }

    private fun initItemTouchHelper() {

        // 밀기 기능은 드래그앤 드롭과 마찬가지로 RecyclerView.ItemDecoration 형식인 ItemTouchHelper
        // 가 대부분 관리한다. 이 클래스가 제공하는 콜백은 항목의 이동과 방향을 감지하고, 이런 액션이 발생한 경우
        // 이 작업의 이벤트를 가로채서 코드에 대응한다.
        val callback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                adapter.removeItem(position)
            }
        }

        val itemTouchHelper = ItemTouchHelper(callback)
        itemTouchHelper.attachToRecyclerView(recyclerView)
    }

    private fun buildDialog(fab: FloatingActionButton) {

        val inflater = layoutInflater.inflate(R.layout.checkout_dialog, null)

        fab.setOnClickListener {
            val builder = AlertDialog.Builder(this)
                .setView(inflater)
                .setTitle(R.string.checkout_dialog_title)
                .setMessage(R.string.checkout_dialog_message)
                .setIcon(R.drawable.ic_baseline_shopping_cart_24)
                .setPositiveButton(R.string.action_ok_text) { _, _ ->
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                .setNegativeButton(R.string.action_cancel_text) { _, _ -> }

            val alertDialog = builder.create()
            alertDialog.show()

            val negativeButton = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE)
            val positiveButton = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE)
            val color = ContextCompat.getColor(this@MainActivity, android.R.color.holo_purple)

            negativeButton.setTextColor(color)
            positiveButton.setTextColor(color)
        }
    }

    private fun initRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(ItemDivider(this, R.drawable.item_divider))
        adapter.setData(cheese)
        recyclerView.adapter = adapter
    }
}