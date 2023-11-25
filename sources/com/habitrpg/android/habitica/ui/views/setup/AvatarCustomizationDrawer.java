package com.habitrpg.android.habitica.ui.views.setup;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.databinding.AvatarSetupDrawerBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.q;

/* compiled from: AvatarCustomizationDrawer.kt */
/* loaded from: classes4.dex */
public final class AvatarCustomizationDrawer extends LinearLayout {
    public static final int $stable = 8;
    private final AvatarSetupDrawerBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCustomizationDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        AvatarSetupDrawerBinding inflate = AvatarSetupDrawerBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this, true);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final AvatarSetupDrawerBinding getBinding() {
        return this.binding;
    }
}
