package com.habitrpg.android.habitica.ui.views.dialogs;

import ad.k0;
import ad.l0;
import android.app.Activity;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.t0;
import androidx.lifecycle.v;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogHabiticaBaseBinding;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.ui.views.login.LockableScrollView;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import dc.w;
import ec.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ma.d;
import pc.p;
import qc.h;
import qc.q;

/* compiled from: HabiticaAlertDialog.kt */
/* loaded from: classes4.dex */
public class HabiticaAlertDialog extends androidx.appcompat.app.c {
    private View additionalContentView;
    private final DialogHabiticaBaseBinding binding;
    private int buttonAxis;
    private int dialogWidth;
    private boolean forceScrollableLayout;
    private boolean isCelebratory;
    private boolean isScrollingLayout;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static List<HabiticaAlertDialog> dialogQueue = new ArrayList();

    /* compiled from: HabiticaAlertDialog.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final void addToQueue(HabiticaAlertDialog habiticaAlertDialog) {
            if (checkIfQueueAvailable()) {
                habiticaAlertDialog.show();
            }
            HabiticaAlertDialog.dialogQueue.add(habiticaAlertDialog);
        }

        private final boolean checkIfQueueAvailable() {
            Object c02;
            boolean z10;
            c02 = b0.c0(HabiticaAlertDialog.dialogQueue);
            HabiticaAlertDialog habiticaAlertDialog = (HabiticaAlertDialog) c02;
            if (habiticaAlertDialog == null) {
                return true;
            }
            if (habiticaAlertDialog.isShowing()) {
                Activity activity = habiticaAlertDialog.getActivity();
                if (activity != null && activity.isFinishing()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
            }
            HabiticaAlertDialog.dialogQueue.remove(0);
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x003e, code lost:
        
            if (r10.isFinishing() == true) goto L46;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void showNextInQueue(com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog r10) {
            /*
                r9 = this;
                java.util.List r0 = com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.access$getDialogQueue$cp()
                java.lang.Object r0 = ec.r.c0(r0)
                boolean r10 = qc.q.d(r0, r10)
                r0 = 0
                if (r10 == 0) goto L16
                java.util.List r10 = com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.access$getDialogQueue$cp()
                r10.remove(r0)
            L16:
                java.util.List r10 = com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.access$getDialogQueue$cp()
                int r10 = r10.size()
                if (r10 <= 0) goto L71
                java.util.List r10 = com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.access$getDialogQueue$cp()
                java.lang.Object r10 = r10.get(r0)
                com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog r10 = (com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog) r10
                android.content.Context r10 = r10.getContext()
                boolean r1 = r10 instanceof com.habitrpg.android.habitica.ui.activities.BaseActivity
                r2 = 0
                if (r1 == 0) goto L36
                com.habitrpg.android.habitica.ui.activities.BaseActivity r10 = (com.habitrpg.android.habitica.ui.activities.BaseActivity) r10
                goto L37
            L36:
                r10 = r2
            L37:
                if (r10 == 0) goto L41
                boolean r10 = r10.isFinishing()
                r1 = 1
                if (r10 != r1) goto L41
                goto L42
            L41:
                r1 = 0
            L42:
                if (r1 != 0) goto L71
                java.util.List r10 = com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.access$getDialogQueue$cp()
                java.lang.Object r10 = r10.get(r0)
                com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog r10 = (com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog) r10
                android.content.Context r10 = r10.getContext()
                boolean r0 = r10 instanceof com.habitrpg.android.habitica.ui.activities.BaseActivity
                if (r0 == 0) goto L59
                com.habitrpg.android.habitica.ui.activities.BaseActivity r10 = (com.habitrpg.android.habitica.ui.activities.BaseActivity) r10
                goto L5a
            L59:
                r10 = r2
            L5a:
                if (r10 == 0) goto L71
                androidx.lifecycle.q r3 = androidx.lifecycle.w.a(r10)
                if (r3 == 0) goto L71
                ad.i2 r4 = ad.a1.c()
                r5 = 0
                com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog$Companion$showNextInQueue$1 r6 = new com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog$Companion$showNextInQueue$1
                r6.<init>(r2)
                r7 = 2
                r8 = 0
                ad.g.d(r3, r4, r5, r6, r7, r8)
            L71:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.Companion.showNextInQueue(com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaAlertDialog(Context context) {
        super(context, R.style.HabiticaAlertDialogTheme);
        q.i(context, "context");
        this.buttonAxis = 1;
        DialogHabiticaBaseBinding inflate = DialogHabiticaBaseBinding.inflate(LayoutInflater.from(context));
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.dialogWidth = 320;
        setView(inflate.getRoot());
        inflate.closeButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.dialogs.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabiticaAlertDialog._init_$lambda$0(HabiticaAlertDialog.this, view);
            }
        });
        inflate.dialogContainer.setClipChildren(true);
        inflate.dialogContainer.setClipToOutline(true);
    }

    public static final void _init_$lambda$0(HabiticaAlertDialog habiticaAlertDialog, View view) {
        q.i(habiticaAlertDialog, "this$0");
        habiticaAlertDialog.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Button addButton$default(HabiticaAlertDialog habiticaAlertDialog, int i10, boolean z10, boolean z11, boolean z12, p pVar, int i11, Object obj) {
        if (obj == null) {
            boolean z13 = (i11 & 4) != 0 ? false : z11;
            boolean z14 = (i11 & 8) != 0 ? true : z12;
            p<? super HabiticaAlertDialog, ? super Integer, w> pVar2 = pVar;
            if ((i11 & 16) != 0) {
                pVar2 = null;
            }
            return habiticaAlertDialog.addButton(i10, z10, z13, z14, pVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addButton");
    }

    public static final void addButton$lambda$3(WeakReference weakReference, p pVar, int i10, boolean z10, HabiticaAlertDialog habiticaAlertDialog, View view) {
        q.i(weakReference, "$weakThis");
        q.i(habiticaAlertDialog, "this$0");
        HabiticaAlertDialog habiticaAlertDialog2 = (HabiticaAlertDialog) weakReference.get();
        if (habiticaAlertDialog2 != null) {
            if (pVar != null) {
                pVar.invoke(habiticaAlertDialog2, Integer.valueOf(i10));
            }
            if (z10) {
                habiticaAlertDialog.dismiss();
            }
        }
    }

    private final void configureButtonLayoutParams(View view) {
        LinearLayout.LayoutParams layoutParams;
        if (isScrollingLayout()) {
            layoutParams = new LinearLayout.LayoutParams(0, IntExtensionsKt.dpToPx(48, getContext()));
            layoutParams.weight = 1.0f;
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, IntExtensionsKt.dpToPx(48, getContext()));
        }
        view.setLayoutParams(layoutParams);
        view.setElevation(10.0f);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(32);
        }
    }

    public static final void onStart$lambda$4(HabiticaAlertDialog habiticaAlertDialog) {
        q.i(habiticaAlertDialog, "this$0");
        RelativeLayout relativeLayout = (RelativeLayout) habiticaAlertDialog.binding.getRoot().findViewById(R.id.confetti_container);
        new d(relativeLayout, 40, androidx.core.content.a.e(habiticaAlertDialog.getContext(), R.drawable.confetti_blue), 6000L).p(1.0E-4f, 90).u(144.0f).x(-0.15f, 0.15f, -0.1f, -0.4f).r(200L, new AccelerateInterpolator()).l(habiticaAlertDialog.binding.titleTextView, 80, 10, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        new d(relativeLayout, 40, androidx.core.content.a.e(habiticaAlertDialog.getContext(), R.drawable.confetti_red), 6000L).p(1.0E-4f, 90).u(144.0f).x(-0.15f, 0.15f, -0.1f, -0.4f).r(200L, new AccelerateInterpolator()).l(habiticaAlertDialog.binding.titleTextView, 80, 10, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        new d(relativeLayout, 40, androidx.core.content.a.e(habiticaAlertDialog.getContext(), R.drawable.confetti_yellow), 6000L).p(1.0E-4f, 90).u(144.0f).x(-0.15f, 0.15f, -0.1f, -0.4f).r(200L, new AccelerateInterpolator()).l(habiticaAlertDialog.binding.titleTextView, 80, 10, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        new d(relativeLayout, 40, androidx.core.content.a.e(habiticaAlertDialog.getContext(), R.drawable.confetti_purple), 6000L).p(1.0E-4f, 90).u(144.0f).x(-0.15f, 0.15f, -0.1f, -0.4f).r(200L, new AccelerateInterpolator()).l(habiticaAlertDialog.binding.titleTextView, 80, 10, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    }

    private final void updateButtonLayout() {
        if (!isScrollingLayout() && this.buttonAxis != 0) {
            this.binding.scrollingSeparator.setVisibility(8);
            this.binding.buttonsWrapper.setOrientation(1);
            FrameLayout frameLayout = this.binding.contentView;
            frameLayout.setPadding(frameLayout.getPaddingStart(), 0, this.binding.contentView.getPaddingEnd(), 0);
            int dimension = (int) getContext().getResources().getDimension(R.dimen.alert_side_padding);
            this.binding.buttonsWrapper.setPadding(IntExtensionsKt.dpToPx(20, getContext()), dimension, dimension, 0);
            LinearLayout linearLayout = this.binding.dialogContainer;
            linearLayout.setPadding(0, linearLayout.getPaddingTop(), 0, IntExtensionsKt.dpToPx(24, getContext()));
        } else {
            this.binding.scrollingSeparator.setVisibility(0);
            this.binding.buttonsWrapper.setOrientation(0);
            int dpToPx = IntExtensionsKt.dpToPx(16, getContext());
            this.binding.buttonsWrapper.setPadding(dpToPx, dpToPx, dpToPx, 0);
            LinearLayout linearLayout2 = this.binding.dialogContainer;
            linearLayout2.setPadding(0, linearLayout2.getPaddingTop(), 0, dpToPx);
            FrameLayout frameLayout2 = this.binding.contentView;
            frameLayout2.setPadding(frameLayout2.getPaddingStart(), 0, this.binding.contentView.getPaddingEnd(), IntExtensionsKt.dpToPx(30, getContext()));
        }
        LinearLayout linearLayout3 = this.binding.buttonsWrapper;
        q.h(linearLayout3, "buttonsWrapper");
        Iterator<View> it = t0.a(linearLayout3).iterator();
        while (it.hasNext()) {
            configureButtonLayoutParams(it.next());
        }
    }

    public final Button addButton(int i10, boolean z10, boolean z11, boolean z12, p<? super HabiticaAlertDialog, ? super Integer, w> pVar) {
        String string = getContext().getString(i10);
        q.h(string, "getString(...)");
        return addButton(string, z10, z11, z12, pVar);
    }

    @Override // androidx.appcompat.app.x, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Companion.showNextInQueue(this);
        super.dismiss();
    }

    public final void enqueue() {
        Companion.addToQueue(this);
    }

    public Activity getActivity() {
        ContextThemeWrapper contextThemeWrapper;
        Activity activity;
        Context context = getContext();
        q.h(context, "getContext(...)");
        while (true) {
            if (context instanceof ContextThemeWrapper) {
                contextThemeWrapper = (ContextThemeWrapper) context;
            } else {
                contextThemeWrapper = null;
            }
            if (contextThemeWrapper != null) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    break;
                }
                context = ((ContextThemeWrapper) context).getBaseContext();
                q.h(context, "getBaseContext(...)");
            } else {
                break;
            }
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        return (Activity) context;
    }

    public final View getAdditionalContentView$Habitica_2311256681_prodRelease() {
        return this.additionalContentView;
    }

    public final int getButtonAxis() {
        return this.buttonAxis;
    }

    /* renamed from: getContentView */
    public final FrameLayout m167getContentView() {
        FrameLayout frameLayout = this.binding.contentView;
        q.h(frameLayout, "contentView");
        return frameLayout;
    }

    public final int getDialogWidth() {
        return this.dialogWidth;
    }

    public final boolean getForceScrollableLayout() {
        return this.forceScrollableLayout;
    }

    public final k0 getLongLivingScope() {
        Activity activity = getActivity();
        if (activity instanceof androidx.appcompat.app.d) {
            return androidx.lifecycle.w.a((v) activity);
        }
        return l0.b();
    }

    public final LockableScrollView getScrollView() {
        LockableScrollView lockableScrollView = this.binding.mainScrollView;
        q.h(lockableScrollView, "mainScrollView");
        return lockableScrollView;
    }

    public final boolean isCelebratory() {
        return this.isCelebratory;
    }

    public final boolean isScrollingLayout() {
        if (this.forceScrollableLayout) {
            return true;
        }
        return this.isScrollingLayout;
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void onStart() {
        super.onStart();
        if (this.isCelebratory) {
            this.binding.titleTextView.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.views.dialogs.c
                @Override // java.lang.Runnable
                public final void run() {
                    HabiticaAlertDialog.onStart$lambda$4(HabiticaAlertDialog.this);
                }
            });
        }
    }

    public final void setAdditionalContentSidePadding(int i10) {
        FrameLayout frameLayout = this.binding.contentView;
        frameLayout.setPadding(i10, 0, i10, frameLayout.getPaddingBottom());
        TextView textView = this.binding.messageTextView;
        textView.setPadding(i10, textView.getPaddingTop(), i10, this.binding.messageTextView.getPaddingBottom());
    }

    public final void setAdditionalContentView(int i10) {
        Context context = getContext();
        q.h(context, "getContext(...)");
        setAdditionalContentView(ContextExtensionsKt.getLayoutInflater(context).inflate(i10, (ViewGroup) this.binding.getRoot(), false));
    }

    public final void setAdditionalContentView$Habitica_2311256681_prodRelease(View view) {
        this.additionalContentView = view;
    }

    public final void setButtonAxis(int i10) {
        this.buttonAxis = i10;
        updateButtonLayout();
    }

    public final void setCelebratory(boolean z10) {
        this.isCelebratory = z10;
    }

    public final void setCustomHeaderView(View view) {
        q.i(view, "customHeader");
        this.binding.dialogContainer.addView(view, 0);
        LinearLayout linearLayout = this.binding.dialogContainer;
        linearLayout.setPadding(0, 0, 0, linearLayout.getPaddingBottom());
    }

    public final void setDialogWidth(int i10) {
        this.dialogWidth = i10;
        ViewGroup.LayoutParams layoutParams = this.binding.dialogWrapper.getLayoutParams();
        layoutParams.width = i10;
        this.binding.dialogWrapper.setLayoutParams(layoutParams);
    }

    public final void setExtraCloseButtonVisibility(int i10) {
        this.binding.closeButton.setVisibility(i10);
    }

    public final void setForceScrollableLayout(boolean z10) {
        this.forceScrollableLayout = z10;
        updateButtonLayout();
    }

    @Override // androidx.appcompat.app.c
    public void setMessage(CharSequence charSequence) {
        if ((charSequence != null ? charSequence.length() : 0) > 0) {
            this.binding.messageTextView.setVisibility(0);
        } else {
            this.binding.messageTextView.setVisibility(8);
        }
        this.binding.messageTextView.setText(charSequence);
        this.binding.messageTextView.setMovementMethod(new ScrollingMovementMethod());
    }

    public final void setNotice(CharSequence charSequence) {
        if ((charSequence != null ? charSequence.length() : 0) > 0) {
            this.binding.noticeTextView.setVisibility(0);
        } else {
            this.binding.noticeTextView.setVisibility(8);
        }
        this.binding.noticeTextView.setText(charSequence);
    }

    public final void setScrollingLayout(boolean z10) {
        this.isScrollingLayout = z10;
        updateButtonLayout();
    }

    @Override // androidx.appcompat.app.c, androidx.appcompat.app.x, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        if ((charSequence != null ? charSequence.length() : 0) > 0) {
            this.binding.titleTextView.setVisibility(0);
        } else {
            this.binding.titleTextView.setVisibility(8);
        }
        this.binding.titleTextView.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Button addButton$default(HabiticaAlertDialog habiticaAlertDialog, String str, boolean z10, boolean z11, boolean z12, p pVar, int i10, Object obj) {
        if (obj == null) {
            boolean z13 = (i10 & 4) != 0 ? false : z11;
            boolean z14 = (i10 & 8) != 0 ? true : z12;
            p<? super HabiticaAlertDialog, ? super Integer, w> pVar2 = pVar;
            if ((i10 & 16) != 0) {
                pVar2 = null;
            }
            return habiticaAlertDialog.addButton(str, z10, z13, z14, pVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addButton");
    }

    public final Button addButton(String str, boolean z10, boolean z11, boolean z12, p<? super HabiticaAlertDialog, ? super Integer, w> pVar) {
        q.i(str, "string");
        if (!z10) {
            LinearLayout linearLayout = this.binding.buttonsWrapper;
            q.h(linearLayout, "buttonsWrapper");
            View inflate$default = ViewGroupExt.inflate$default(linearLayout, R.layout.dialog_habitica_secondary_button, false, 2, null);
            r3 = inflate$default instanceof Button ? (Button) inflate$default : null;
            if (z11 && r3 != null) {
                r3.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_red));
            }
        } else if (z11) {
            LinearLayout linearLayout2 = this.binding.buttonsWrapper;
            q.h(linearLayout2, "buttonsWrapper");
            View inflate$default2 = ViewGroupExt.inflate$default(linearLayout2, R.layout.dialog_habitica_primary_destructive_button, false, 2, null);
            if (inflate$default2 instanceof Button) {
                r3 = (Button) inflate$default2;
            }
        } else {
            LinearLayout linearLayout3 = this.binding.buttonsWrapper;
            q.h(linearLayout3, "buttonsWrapper");
            View inflate$default3 = ViewGroupExt.inflate$default(linearLayout3, R.layout.dialog_habitica_primary_button, false, 2, null);
            if (inflate$default3 instanceof Button) {
                r3 = (Button) inflate$default3;
            }
        }
        if (r3 == null) {
            r3 = new Button(getContext());
        }
        r3.setText(str);
        r3.setElevation(0.0f);
        View addButton = addButton(r3, z12, pVar);
        q.g(addButton, "null cannot be cast to non-null type android.widget.Button");
        return (Button) addButton;
    }

    public final View getContentView() {
        return this.additionalContentView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ View addButton$default(HabiticaAlertDialog habiticaAlertDialog, View view, boolean z10, p pVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                pVar = null;
            }
            return habiticaAlertDialog.addButton(view, z10, pVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addButton");
    }

    public final void setAdditionalContentView(View view) {
        this.binding.getRoot().removeView(this.additionalContentView);
        this.additionalContentView = view;
        this.binding.contentView.addView(view);
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.binding.contentView.forceLayout();
    }

    public final void setNotice(int i10) {
        setNotice(getContext().getString(i10));
    }

    @Override // androidx.appcompat.app.x, android.app.Dialog
    public void setTitle(int i10) {
        setTitle(getContext().getString(i10));
    }

    public final void setMessage(int i10) {
        setMessage(getContext().getString(i10));
    }

    public final View addButton(View view, final boolean z10, final p<? super HabiticaAlertDialog, ? super Integer, w> pVar) {
        q.i(view, "buttonView");
        final WeakReference weakReference = new WeakReference(this);
        final int childCount = this.binding.buttonsWrapper.getChildCount();
        view.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.dialogs.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HabiticaAlertDialog.addButton$lambda$3(weakReference, pVar, childCount, z10, this, view2);
            }
        });
        configureButtonLayoutParams(view);
        this.binding.buttonsWrapper.addView(view);
        view.setPadding(IntExtensionsKt.dpToPx(24, getContext()), 0, IntExtensionsKt.dpToPx(24, getContext()), 0);
        return view;
    }
}
