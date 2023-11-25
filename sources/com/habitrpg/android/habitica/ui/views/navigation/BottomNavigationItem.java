package com.habitrpg.android.habitica.ui.views.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.BottomNavigationItemBinding;
import com.habitrpg.android.habitica.extensions.DrawableExtendsionsKt;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.q;

/* compiled from: BottomNavigationItem.kt */
/* loaded from: classes4.dex */
public final class BottomNavigationItem extends RelativeLayout {
    public static final int $stable = 8;
    private int badgeCount;
    private final BottomNavigationItemBinding binding;
    private int deselectedVisibility;
    private Drawable icon;
    private boolean isActive;
    private Drawable selectedIcon;
    private int selectedVisibility;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomNavigationItem(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    public final int getBadgeCount() {
        return this.badgeCount;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z10) {
        this.isActive = z10;
        if (z10) {
            this.binding.selectedTitleView.setVisibility(this.selectedVisibility);
            this.binding.titleView.setVisibility(8);
            this.binding.iconView.setImageDrawable(this.selectedIcon);
            Context context = getContext();
            q.h(context, "getContext(...)");
            if (ContextExtensionsKt.isUsingNightModeResources(context)) {
                Drawable drawable = this.binding.iconView.getDrawable();
                q.h(drawable, "getDrawable(...)");
                Context context2 = getContext();
                q.h(context2, "getContext(...)");
                DrawableExtendsionsKt.setTintWith(drawable, ContextExtensionsKt.getThemeColor(context2, R.attr.colorPrimaryDistinct), PorterDuff.Mode.SRC_ATOP);
                return;
            }
            Drawable drawable2 = this.binding.iconView.getDrawable();
            q.h(drawable2, "getDrawable(...)");
            DrawableExtendsionsKt.setTintWith(drawable2, androidx.core.content.a.c(getContext(), R.color.white), PorterDuff.Mode.SRC_ATOP);
            return;
        }
        this.binding.selectedTitleView.setVisibility(8);
        this.binding.iconView.setImageDrawable(this.icon);
        this.binding.titleView.setVisibility(this.deselectedVisibility);
        Drawable drawable3 = this.binding.iconView.getDrawable();
        q.h(drawable3, "getDrawable(...)");
        Context context3 = getContext();
        q.h(context3, "getContext(...)");
        DrawableExtendsionsKt.setTintWith(drawable3, ContextExtensionsKt.getThemeColor(context3, R.attr.textColorPrimaryDark), PorterDuff.Mode.SRC_ATOP);
    }

    public final void setBadgeCount(int i10) {
        this.badgeCount = i10;
        if (i10 == 0) {
            this.binding.badge.setVisibility(4);
            return;
        }
        this.binding.badge.setVisibility(0);
        this.binding.badge.setText(String.valueOf(i10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomNavigationItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ BottomNavigationItem(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationItem(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        BottomNavigationItemBinding inflate = BottomNavigationItemBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        Resources.Theme theme = context.getTheme();
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, R.styleable.BottomNavigationItem, 0, 0) : null;
        if (obtainStyledAttributes != null) {
            this.icon = obtainStyledAttributes.getDrawable(0);
            this.selectedIcon = obtainStyledAttributes.getDrawable(1);
            inflate.iconView.setImageDrawable(this.icon);
            inflate.titleView.setText(obtainStyledAttributes.getString(2));
            inflate.selectedTitleView.setText(obtainStyledAttributes.getString(2));
        }
    }
}
