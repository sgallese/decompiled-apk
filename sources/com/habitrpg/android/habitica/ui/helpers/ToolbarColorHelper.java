package com.habitrpg.android.habitica.ui.helpers;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import java.util.ArrayList;
import qc.q;

/* compiled from: ToolbarColorHelper.kt */
/* loaded from: classes4.dex */
public final class ToolbarColorHelper {
    public static final int $stable = 0;
    public static final ToolbarColorHelper INSTANCE = new ToolbarColorHelper();

    private ToolbarColorHelper() {
    }

    private final void colorizeChild(final View view, int i10, final PorterDuffColorFilter porterDuffColorFilter) {
        if (view instanceof ActionMenuItemView) {
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
            actionMenuItemView.setTextColor(i10);
            int length = actionMenuItemView.getCompoundDrawables().length;
            for (final int i11 = 0; i11 < length; i11++) {
                view.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.helpers.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ToolbarColorHelper.colorizeChild$lambda$0(view, i11, porterDuffColorFilter);
                    }
                });
            }
        }
    }

    public static final void colorizeChild$lambda$0(View view, int i10, PorterDuffColorFilter porterDuffColorFilter) {
        q.i(view, "$innerView");
        q.i(porterDuffColorFilter, "$colorFilter");
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
        if (actionMenuItemView.getCompoundDrawables()[i10] != null) {
            actionMenuItemView.getCompoundDrawables()[i10].setColorFilter(porterDuffColorFilter);
        }
    }

    public static /* synthetic */ void colorizeToolbar$default(ToolbarColorHelper toolbarColorHelper, Toolbar toolbar, Activity activity, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        toolbarColorHelper.colorizeToolbar(toolbar, activity, num, num2);
    }

    private final void setOverflowButtonColor(Activity activity, final int i10) {
        final String string = activity.getString(R.string.abc_action_menu_overflow_description);
        q.h(string, "getString(...)");
        final View decorView = activity.getWindow().getDecorView();
        q.h(decorView, "getDecorView(...)");
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.habitrpg.android.habitica.ui.helpers.ToolbarColorHelper$setOverflowButtonColor$$inlined$waitForLayout$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ActionMenuView actionMenuView;
                Drawable overflowIcon;
                Drawable overflowIcon2;
                decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                View view = decorView;
                ArrayList<View> arrayList = new ArrayList<>();
                view.findViewsWithText(arrayList, string, 2);
                if (!arrayList.isEmpty()) {
                    ViewParent parent = arrayList.get(0).getParent();
                    if (parent instanceof ActionMenuView) {
                        actionMenuView = (ActionMenuView) parent;
                    } else {
                        actionMenuView = null;
                    }
                    if (actionMenuView != null && (overflowIcon2 = actionMenuView.getOverflowIcon()) != null) {
                        overflowIcon2.setTint(i10);
                    }
                    if (actionMenuView != null && (overflowIcon = actionMenuView.getOverflowIcon()) != null) {
                        overflowIcon.setTintMode(PorterDuff.Mode.SRC_ATOP);
                    }
                }
            }
        });
    }

    public final void colorizeToolbar(Toolbar toolbar, Activity activity, Integer num, Integer num2) {
        int themeColor;
        int themeColor2;
        q.i(toolbar, "toolbar");
        if (activity == null) {
            return;
        }
        if (num2 != null) {
            themeColor = num2.intValue();
        } else {
            themeColor = ContextExtensionsKt.getThemeColor(activity, R.attr.headerBackgroundColor);
        }
        toolbar.setBackgroundColor(themeColor);
        if (num != null) {
            themeColor2 = num.intValue();
        } else {
            themeColor2 = ContextExtensionsKt.getThemeColor(activity, R.attr.headerTextColor);
        }
        if (Build.VERSION.SDK_INT < 23) {
            activity.getWindow().setStatusBarColor(ContextExtensionsKt.getThemeColor(activity, R.attr.colorPrimaryDark));
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(themeColor2, PorterDuff.Mode.MULTIPLY);
        int childCount = toolbar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof ImageButton) {
                ((ImageButton) childAt).getDrawable().setColorFilter(porterDuffColorFilter);
            } else if (childAt instanceof ActionMenuView) {
                ActionMenuView actionMenuView = (ActionMenuView) childAt;
                int childCount2 = actionMenuView.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt2 = actionMenuView.getChildAt(i11);
                    q.h(childAt2, "getChildAt(...)");
                    colorizeChild(childAt2, themeColor2, porterDuffColorFilter);
                }
            } else if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(themeColor2);
            }
        }
        toolbar.setTitleTextColor(themeColor2);
        toolbar.setSubtitleTextColor(themeColor2);
        setOverflowButtonColor(activity, themeColor2);
    }
}
