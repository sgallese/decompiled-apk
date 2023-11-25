package com.habitrpg.android.habitica.ui.views.dialogs;

import android.content.Context;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import qc.h;
import qc.q;

/* compiled from: HabiticaProgressDialog.kt */
/* loaded from: classes4.dex */
public final class HabiticaProgressDialog extends HabiticaAlertDialog {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: HabiticaProgressDialog.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public static /* synthetic */ HabiticaProgressDialog show$default(Companion companion, Context context, String str, int i10, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                i10 = 300;
            }
            return companion.show(context, str, i10);
        }

        public final HabiticaProgressDialog show(Context context, int i10) {
            q.i(context, "context");
            return show$default(this, context, context.getString(i10), 0, 4, null);
        }

        public final HabiticaProgressDialog show(Context context, String str, int i10) {
            q.i(context, "context");
            HabiticaProgressDialog habiticaProgressDialog = new HabiticaProgressDialog(context);
            habiticaProgressDialog.setAdditionalContentView(R.layout.circular_progress);
            habiticaProgressDialog.setDialogWidth(IntExtensionsKt.dpToPx(i10, context));
            habiticaProgressDialog.setTitle(str);
            habiticaProgressDialog.enqueue();
            return habiticaProgressDialog;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaProgressDialog(Context context) {
        super(context);
        q.i(context, "context");
    }
}
