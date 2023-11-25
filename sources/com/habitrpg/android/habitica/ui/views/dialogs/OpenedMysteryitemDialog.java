package com.habitrpg.android.habitica.ui.views.dialogs;

import android.content.Context;
import com.habitrpg.android.habitica.databinding.DialogOpenMysteryitemBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import qc.q;

/* compiled from: OpenedMysteryitemDialog.kt */
/* loaded from: classes4.dex */
public final class OpenedMysteryitemDialog extends HabiticaAlertDialog {
    public static final int $stable = 8;
    private final DialogOpenMysteryitemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenedMysteryitemDialog(Context context) {
        super(context);
        q.i(context, "context");
        DialogOpenMysteryitemBinding inflate = DialogOpenMysteryitemBinding.inflate(ContextExtensionsKt.getLayoutInflater(context));
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        setAdditionalContentView(inflate.getRoot());
        setDialogWidth(IntExtensionsKt.dpToPx(302, context));
    }

    public final DialogOpenMysteryitemBinding getBinding() {
        return this.binding;
    }
}
