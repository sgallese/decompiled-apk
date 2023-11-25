package com.habitrpg.android.habitica.ui.views.dialogs;

import android.content.Context;
import android.view.View;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.BottomSheetWrapperBinding;
import qc.q;

/* compiled from: HabiticaBottomSheetDialog.kt */
/* loaded from: classes4.dex */
public class HabiticaBottomSheetDialog extends com.google.android.material.bottomsheet.a {
    public static final int $stable = 8;
    private final BottomSheetWrapperBinding wrapperBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaBottomSheetDialog(Context context) {
        super(context, R.style.SheetDialog);
        q.i(context, "context");
        BottomSheetWrapperBinding inflate = BottomSheetWrapperBinding.inflate(getLayoutInflater());
        q.h(inflate, "inflate(...)");
        this.wrapperBinding = inflate;
        getBehavior().K0(context.getResources().getDisplayMetrics().heightPixels / 2);
    }

    public final int getGrabberVisibility() {
        return this.wrapperBinding.grabber.getVisibility();
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void setContentView(View view) {
        q.i(view, "view");
        this.wrapperBinding.container.addView(view);
        super.setContentView(this.wrapperBinding.getRoot());
    }

    public final void setGrabberVisibility(int i10) {
        this.wrapperBinding.grabber.setVisibility(i10);
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void setContentView(int i10) {
        getLayoutInflater().inflate(i10, this.wrapperBinding.container);
        super.setContentView(this.wrapperBinding.getRoot());
    }
}
