package com.habitrpg.common.habitica.helpers;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.common.habitica.databinding.FailedItemBinding;
import dc.w;
import qc.q;

/* compiled from: RecyclerViewEmptySupport.kt */
/* loaded from: classes4.dex */
public final class FailedViewHolder extends RecyclerView.f0 {
    private final FailedItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedViewHolder(View view) {
        super(view);
        q.i(view, "itemView");
        FailedItemBinding bind = FailedItemBinding.bind(view);
        q.h(bind, "bind(...)");
        this.binding = bind;
    }

    public final void bind(final pc.a<w> aVar) {
        if (aVar != null) {
            this.binding.refreshButton.setVisibility(0);
            this.binding.refreshButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.common.habitica.helpers.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pc.a.this.invoke();
                }
            });
            return;
        }
        this.binding.refreshButton.setVisibility(8);
    }
}
