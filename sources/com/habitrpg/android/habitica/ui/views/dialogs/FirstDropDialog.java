package com.habitrpg.android.habitica.ui.views.dialogs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: FirstDropDialog.kt */
/* loaded from: classes4.dex */
public final class FirstDropDialog extends HabiticaAlertDialog {
    public static final int $stable = 8;
    private PixelArtView eggView;
    private PixelArtView hatchingPotionView;

    /* compiled from: FirstDropDialog.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.dialogs.FirstDropDialog$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends r implements p<HabiticaAlertDialog, Integer, w> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.itemsFragment, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstDropDialog(Context context) {
        super(context);
        LayoutInflater layoutInflater;
        View view;
        PixelArtView pixelArtView;
        q.i(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService instanceof LayoutInflater) {
            layoutInflater = (LayoutInflater) systemService;
        } else {
            layoutInflater = null;
        }
        if (layoutInflater != null) {
            view = layoutInflater.inflate(R.layout.dialog_first_drop, (ViewGroup) null);
        } else {
            view = null;
        }
        if (view != null) {
            pixelArtView = (PixelArtView) view.findViewById(R.id.egg_view);
        } else {
            pixelArtView = null;
        }
        this.eggView = pixelArtView;
        this.hatchingPotionView = view != null ? (PixelArtView) view.findViewById(R.id.hatchingPotion_view) : null;
        setAdditionalContentView(view);
        HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.go_to_items, true, false, false, (p) AnonymousClass1.INSTANCE, 8, (Object) null);
        HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.close, false, false, false, (p) null, 28, (Object) null);
        setTitle(R.string.first_drop_title);
    }

    public final void configure(String str, String str2) {
        q.i(str, "egg");
        q.i(str2, "hatchingPotion");
        PixelArtView pixelArtView = this.eggView;
        if (pixelArtView != null) {
            DataBindingUtilsKt.loadImage$default(pixelArtView, "Pet_Egg_" + str, null, 2, null);
        }
        PixelArtView pixelArtView2 = this.hatchingPotionView;
        if (pixelArtView2 != null) {
            DataBindingUtilsKt.loadImage$default(pixelArtView2, "Pet_HatchingPotion_" + str2, null, 2, null);
        }
    }
}
