package com.habitrpg.android.habitica.ui.adapter.social;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.databinding.SystemChatMessageBinding;
import dc.w;
import java.text.DateFormat;
import qc.q;

/* compiled from: ChatRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class SystemChatMessageViewHolder extends RecyclerView.f0 {
    public static final int $stable = 8;
    private final SystemChatMessageBinding binding;
    private final DateFormat dateTime;
    private pc.a<w> onShouldExpand;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemChatMessageViewHolder(View view) {
        super(view);
        q.i(view, "itemView");
        this.dateTime = DateFormat.getDateTimeInstance();
        SystemChatMessageBinding bind = SystemChatMessageBinding.bind(view);
        q.h(bind, "bind(...)");
        this.binding = bind;
        bind.textView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.adapter.social.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SystemChatMessageViewHolder._init_$lambda$0(SystemChatMessageViewHolder.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SystemChatMessageViewHolder systemChatMessageViewHolder, View view) {
        q.i(systemChatMessageViewHolder, "this$0");
        pc.a<w> aVar = systemChatMessageViewHolder.onShouldExpand;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        r2 = yc.w.n0(r2, "`");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bind(com.habitrpg.android.habitica.models.social.ChatMessage r5, boolean r6) {
        /*
            r4 = this;
            com.habitrpg.android.habitica.databinding.SystemChatMessageBinding r0 = r4.binding
            android.widget.TextView r0 = r0.textView
            r1 = 0
            if (r5 == 0) goto L1a
            java.lang.String r2 = r5.getText()
            if (r2 == 0) goto L1a
            java.lang.String r3 = "`"
            java.lang.String r2 = yc.m.n0(r2, r3)
            if (r2 == 0) goto L1a
            java.lang.String r2 = yc.m.o0(r2, r3)
            goto L1b
        L1a:
            r2 = r1
        L1b:
            r0.setText(r2)
            com.habitrpg.android.habitica.databinding.SystemChatMessageBinding r0 = r4.binding
            android.widget.TextView r0 = r0.systemMessageTimestamp
            if (r5 == 0) goto L39
            java.lang.Long r5 = r5.getTimestamp()
            if (r5 == 0) goto L39
            long r1 = r5.longValue()
            java.util.Date r5 = new java.util.Date
            r5.<init>(r1)
            java.text.DateFormat r1 = r4.dateTime
            java.lang.String r1 = r1.format(r5)
        L39:
            r0.setText(r1)
            if (r6 == 0) goto L47
            com.habitrpg.android.habitica.databinding.SystemChatMessageBinding r5 = r4.binding
            android.widget.TextView r5 = r5.systemMessageTimestamp
            r6 = 0
            r5.setVisibility(r6)
            goto L50
        L47:
            com.habitrpg.android.habitica.databinding.SystemChatMessageBinding r5 = r4.binding
            android.widget.TextView r5 = r5.systemMessageTimestamp
            r6 = 8
            r5.setVisibility(r6)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.adapter.social.SystemChatMessageViewHolder.bind(com.habitrpg.android.habitica.models.social.ChatMessage, boolean):void");
    }

    public final SystemChatMessageBinding getBinding() {
        return this.binding;
    }

    public final pc.a<w> getOnShouldExpand() {
        return this.onShouldExpand;
    }

    public final void setOnShouldExpand(pc.a<w> aVar) {
        this.onShouldExpand = aVar;
    }
}
