package com.habitrpg.android.habitica.ui.views.navigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.habitrpg.android.habitica.databinding.BottomNavigationSubmenuBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import dc.w;
import qc.q;

/* compiled from: BottomNavigationSubmenuItem.kt */
/* loaded from: classes4.dex */
public final class BottomNavigationSubmenuItem extends RelativeLayout {
    public static final int $stable = 8;
    private final BottomNavigationSubmenuBinding binding;
    private Drawable icon;
    private pc.a<w> onAddListener;
    private String title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomNavigationSubmenuItem(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(BottomNavigationSubmenuItem bottomNavigationSubmenuItem, View view) {
        q.i(bottomNavigationSubmenuItem, "this$0");
        pc.a<w> aVar = bottomNavigationSubmenuItem.onAddListener;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(BottomNavigationSubmenuItem bottomNavigationSubmenuItem, View view) {
        q.i(bottomNavigationSubmenuItem, "this$0");
        pc.a<w> aVar = bottomNavigationSubmenuItem.onAddListener;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final Drawable getIcon() {
        return this.icon;
    }

    public final int getMeasuredTitleWidth() {
        this.binding.titleView.measure(getWidth(), getHeight());
        return this.binding.titleView.getMeasuredWidth();
    }

    public final pc.a<w> getOnAddListener() {
        return this.onAddListener;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setIcon(Drawable drawable) {
        this.icon = drawable;
        this.binding.iconView.setImageDrawable(drawable);
    }

    public final void setOnAddListener(pc.a<w> aVar) {
        this.onAddListener = aVar;
    }

    public final void setTitle(String str) {
        this.title = str;
        this.binding.titleView.setText(str);
    }

    public final void setTitleWidth(int i10) {
        RelativeLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = this.binding.titleView.getLayoutParams();
        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
            layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = i10;
        }
        this.binding.titleView.setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomNavigationSubmenuItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ BottomNavigationSubmenuItem(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationSubmenuItem(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        BottomNavigationSubmenuBinding inflate = BottomNavigationSubmenuBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        inflate.iconView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.navigation.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomNavigationSubmenuItem._init_$lambda$0(BottomNavigationSubmenuItem.this, view);
            }
        });
        inflate.titleView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.navigation.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomNavigationSubmenuItem._init_$lambda$1(BottomNavigationSubmenuItem.this, view);
            }
        });
    }
}
