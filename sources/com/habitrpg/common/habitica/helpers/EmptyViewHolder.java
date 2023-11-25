package com.habitrpg.common.habitica.helpers;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.common.habitica.R;
import com.habitrpg.common.habitica.databinding.EmptyItemBinding;
import dc.w;
import qc.q;

/* compiled from: RecyclerViewEmptySupport.kt */
/* loaded from: classes4.dex */
public final class EmptyViewHolder extends RecyclerView.f0 {
    private final EmptyItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyViewHolder(View view) {
        super(view);
        q.i(view, "itemView");
        EmptyItemBinding bind = EmptyItemBinding.bind(view);
        q.h(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(EmptyItem emptyItem, View view) {
        pc.a<w> onButtonTap = emptyItem.getOnButtonTap();
        if (onButtonTap != null) {
            onButtonTap.invoke();
        }
    }

    public final void bind(final EmptyItem emptyItem) {
        String str;
        String str2;
        Integer iconResource;
        boolean z10 = false;
        if (emptyItem != null && emptyItem.getTintedIcon()) {
            z10 = true;
        }
        if (z10) {
            this.binding.emptyIconView.setColorFilter(androidx.core.content.a.c(this.itemView.getContext(), R.color.text_dimmed), PorterDuff.Mode.MULTIPLY);
        }
        if (emptyItem != null && (iconResource = emptyItem.getIconResource()) != null) {
            this.binding.emptyIconView.setImageResource(iconResource.intValue());
        }
        TextView textView = this.binding.emptyViewTitle;
        pc.a<w> aVar = null;
        if (emptyItem != null) {
            str = emptyItem.getTitle();
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = this.binding.emptyViewDescription;
        q.h(textView2, "emptyViewDescription");
        if (emptyItem != null) {
            str2 = emptyItem.getText();
        } else {
            str2 = null;
        }
        MarkdownParserKt.setMarkdown(textView2, str2);
        if (emptyItem != null) {
            aVar = emptyItem.getOnButtonTap();
        }
        if (aVar != null) {
            this.binding.emptyView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.common.habitica.helpers.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EmptyViewHolder.bind$lambda$1(EmptyItem.this, view);
                }
            });
        }
    }
}
