package com.habitrpg.android.habitica.ui.adapter.setup;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.j;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.DrawableExtendsionsKt;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import ec.t;
import java.util.ArrayList;
import java.util.List;
import qc.q;

/* compiled from: TaskSetupAdapter.kt */
/* loaded from: classes4.dex */
public final class TaskSetupAdapter extends RecyclerView.h<TaskViewHolder> {
    public static final int $stable = 8;
    private List<Boolean> checkedList = new ArrayList();
    private List<? extends List<String>> taskList;

    /* compiled from: TaskSetupAdapter.kt */
    /* loaded from: classes4.dex */
    public final class TaskViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        private Context context;
        private final Drawable icon;
        private Boolean isChecked;
        private List<String> taskGroup;
        private final TextView textView;
        final /* synthetic */ TaskSetupAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskViewHolder(TaskSetupAdapter taskSetupAdapter, View view) {
            super(view);
            q.i(view, "itemView");
            this.this$0 = taskSetupAdapter;
            View findViewById = view.findViewById(R.id.textView);
            q.h(findViewById, "findViewById(...)");
            this.textView = (TextView) findViewById;
            Context context = view.getContext();
            q.h(context, "getContext(...)");
            this.context = context;
            view.setOnClickListener(this);
            j b10 = j.b(this.context.getResources(), R.drawable.ic_check_white_18dp, null);
            this.icon = b10;
            if (b10 != null) {
                DrawableExtendsionsKt.setTintWith(b10, a.c(this.context, R.color.brand_100), PorterDuff.Mode.MULTIPLY);
            }
        }

        public final void bind(List<String> list, Boolean bool) {
            q.i(list, "taskGroup");
            this.taskGroup = list;
            this.isChecked = bool;
            this.textView.setText(list.get(0));
            if (q.d(this.isChecked, Boolean.TRUE)) {
                this.textView.setCompoundDrawablesWithIntrinsicBounds(this.icon, (Drawable) null, (Drawable) null, (Drawable) null);
                Drawable background = this.textView.getBackground();
                q.h(background, "getBackground(...)");
                DrawableExtendsionsKt.setTintWith(background, a.c(this.context, R.color.white), PorterDuff.Mode.MULTIPLY);
                this.textView.setTextColor(a.c(this.context, R.color.brand_100));
                return;
            }
            this.textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            Drawable background2 = this.textView.getBackground();
            q.h(background2, "getBackground(...)");
            DrawableExtendsionsKt.setTintWith(background2, a.c(this.context, R.color.brand_100), PorterDuff.Mode.MULTIPLY);
            this.textView.setTextColor(a.c(this.context, R.color.white));
        }

        public final Context getContext() {
            return this.context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q.i(view, "v");
            int bindingAdapterPosition = getBindingAdapterPosition();
            this.this$0.getCheckedList().set(bindingAdapterPosition, Boolean.valueOf(!this.this$0.getCheckedList().get(bindingAdapterPosition).booleanValue()));
            this.this$0.notifyItemChanged(bindingAdapterPosition);
        }

        public final void setContext(Context context) {
            q.i(context, "<set-?>");
            this.context = context;
        }
    }

    public TaskSetupAdapter() {
        List<? extends List<String>> i10;
        i10 = t.i();
        this.taskList = i10;
    }

    public final List<Boolean> getCheckedList() {
        return this.checkedList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.taskList.size();
    }

    public final void setCheckedList(List<Boolean> list) {
        q.i(list, "<set-?>");
        this.checkedList = list;
    }

    public final void setTaskList(List<? extends List<String>> list) {
        q.i(list, "taskList");
        this.taskList = list;
        this.checkedList = new ArrayList();
        for (List<String> list2 : this.taskList) {
            this.checkedList.add(Boolean.FALSE);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(TaskViewHolder taskViewHolder, int i10) {
        q.i(taskViewHolder, "holder");
        taskViewHolder.bind(this.taskList.get(i10), this.checkedList.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public TaskViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        return new TaskViewHolder(this, ViewGroupExt.inflate$default(viewGroup, R.layout.task_setup_item, false, 2, null));
    }
}
