package com.habitrpg.android.habitica.ui.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.core.view.t0;
import androidx.recyclerview.widget.m;
import com.google.android.gms.common.internal.ImagesContract;
import com.habitrpg.android.habitica.databinding.MenuBottomSheetBinding;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaBottomSheetDialog;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.w;
import ec.t;
import pc.l;
import qc.q;

/* compiled from: BottomSheetMenu.kt */
/* loaded from: classes4.dex */
public final class BottomSheetMenu extends HabiticaBottomSheetDialog implements View.OnClickListener {
    public static final int $stable = 8;
    private MenuBottomSheetBinding binding;
    private l<? super Integer, w> runnable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetMenu(Context context) {
        super(context);
        q.i(context, "context");
        MenuBottomSheetBinding inflate = MenuBottomSheetBinding.inflate(getLayoutInflater());
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        LinearLayout root = inflate.getRoot();
        q.h(root, "getRoot(...)");
        setContentView(root);
        this.binding.titleView.setVisibility(8);
    }

    public final void addMenuItem(BottomSheetMenuItem bottomSheetMenuItem) {
        q.i(bottomSheetMenuItem, "menuItem");
        Context context = getContext();
        q.h(context, "getContext(...)");
        LayoutInflater layoutInflater = getLayoutInflater();
        q.h(layoutInflater, "getLayoutInflater(...)");
        LinearLayout linearLayout = this.binding.menuItems;
        q.h(linearLayout, "menuItems");
        View inflate = bottomSheetMenuItem.inflate(context, layoutInflater, linearLayout);
        inflate.setOnClickListener(this);
        this.binding.menuItems.addView(inflate);
        this.binding.getRoot().requestLayout();
    }

    @Override // com.google.android.material.bottomsheet.a, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LinearLayout linearLayout = this.binding.menuItems;
        q.h(linearLayout, "menuItems");
        int i10 = 0;
        for (View view : t0.a(linearLayout)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                t.r();
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, IntExtensionsKt.dpToPx(10.0f, getContext()) + (IntExtensionsKt.dpToPx(5.0f, getContext()) * i10), 0.0f);
            long j10 = i10 * 20;
            translateAnimation.setStartOffset(300 + j10);
            translateAnimation.setFillBefore(true);
            translateAnimation.setFillAfter(true);
            translateAnimation.setInterpolator(new LinearInterpolator());
            translateAnimation.setDuration(((long) m.e.DEFAULT_DRAG_ANIMATION_DURATION) + j10);
            view.startAnimation(translateAnimation);
            i10 = i11;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int indexOfChild;
        q.i(view, "v");
        if (this.runnable != null && (indexOfChild = this.binding.menuItems.indexOfChild(view)) != -1) {
            l<? super Integer, w> lVar = this.runnable;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(indexOfChild));
            }
            dismiss();
        }
    }

    public final void setImage(String str) {
        q.i(str, ImagesContract.URL);
        PixelArtView pixelArtView = this.binding.iconView;
        q.h(pixelArtView, "iconView");
        DataBindingUtilsKt.loadImage$default(pixelArtView, str, null, 2, null);
        this.binding.iconView.setVisibility(0);
    }

    public final void setSelectionRunnable(l<? super Integer, w> lVar) {
        q.i(lVar, "runnable");
        this.runnable = lVar;
    }

    @Override // androidx.appcompat.app.x, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.binding.titleView.setText(charSequence);
        this.binding.titleView.setVisibility(0);
        this.binding.titleView.setBackground(null);
    }
}
