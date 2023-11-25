package com.habitrpg.android.habitica.ui.fragments.preferences;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.o2;
import androidx.core.view.p0;
import com.google.android.material.card.MaterialCardView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogHabiticaAccountBinding;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.User;
import qc.q;

/* compiled from: HabiticaAccountDialog.kt */
/* loaded from: classes4.dex */
public final class HabiticaAccountDialog extends Hilt_HabiticaAccountDialog {
    public static final String TAG = "HabiticaAccountDialog";
    private DialogHabiticaAccountBinding _binding;
    private String accountAction;
    private AccountUpdateConfirmed accountUpdateConfirmed;
    private Context thisContext;
    private User user;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HabiticaAccountDialog.kt */
    /* loaded from: classes4.dex */
    public interface AccountUpdateConfirmed {
        void deletionConfirmClicked(String str);

        void resetConfirmedClicked();
    }

    /* compiled from: HabiticaAccountDialog.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaAccountDialog(Context context) {
        super(R.layout.dialog_habitica_account);
        q.i(context, "thisContext");
        this.thisContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogHabiticaAccountBinding getBinding() {
        DialogHabiticaAccountBinding dialogHabiticaAccountBinding = this._binding;
        q.f(dialogHabiticaAccountBinding);
        return dialogHabiticaAccountBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$2(DialogInterface dialogInterface) {
        q.i(dialogInterface, "dialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        aVar.getBehavior().P0(3);
        aVar.getBehavior().C0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(HabiticaAccountDialog habiticaAccountDialog, View view) {
        q.i(habiticaAccountDialog, "this$0");
        habiticaAccountDialog.dismiss();
    }

    private final void setDeleteAccountViews() {
        String str;
        Authentication authentication;
        getBinding().titleTextview.setText(R.string.are_you_sure_you_want_to_delete);
        getBinding().confirmationTextInputLayout.setHint(R.string.password);
        getBinding().confirmActionTextview.setText(R.string.delete_account);
        TextView textView = getBinding().warningDescriptionTextview;
        Context context = getContext();
        String str2 = null;
        if (context != null) {
            str = context.getString(R.string.delete_account_description);
        } else {
            str = null;
        }
        textView.setText(str);
        User user = this.user;
        boolean z10 = false;
        if (user != null && (authentication = user.getAuthentication()) != null && authentication.getHasPassword()) {
            z10 = true;
        }
        if (!z10) {
            TextView textView2 = getBinding().warningDescriptionTextview;
            Context context2 = getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.delete_oauth_account_description);
            }
            textView2.setText(str2);
            getBinding().confirmationTextInputLayout.setHint(R.string.confirm_deletion);
            getBinding().confirmationInputEdittext.setInputType(1);
        }
        getBinding().confirmationInputEdittext.addTextChangedListener(new TextWatcher() { // from class: com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog$setDeleteAccountViews$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                DialogHabiticaAccountBinding binding;
                Context context3;
                DialogHabiticaAccountBinding binding2;
                binding = HabiticaAccountDialog.this.getBinding();
                TextView textView3 = binding.confirmActionTextview;
                context3 = HabiticaAccountDialog.this.thisContext;
                textView3.setTextColor(androidx.core.content.a.c(context3, R.color.gray_300));
                binding2 = HabiticaAccountDialog.this.getBinding();
                binding2.confirmActionTextview.setAlpha(0.4f);
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
            
                if (qc.q.d(r2, r5) == false) goto L22;
             */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
                /*
                    r1 = this;
                    com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.this
                    com.habitrpg.android.habitica.databinding.DialogHabiticaAccountBinding r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.access$getBinding(r2)
                    com.google.android.material.textfield.TextInputEditText r2 = r2.confirmationInputEdittext
                    android.text.Editable r2 = r2.getText()
                    java.lang.String r2 = java.lang.String.valueOf(r2)
                    int r2 = r2.length()
                    r3 = 1
                    r4 = 0
                    if (r2 <= 0) goto L1a
                    r2 = 1
                    goto L1b
                L1a:
                    r2 = 0
                L1b:
                    if (r2 == 0) goto L9b
                    com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.this
                    com.habitrpg.android.habitica.models.user.User r2 = r2.getUser()
                    if (r2 == 0) goto L33
                    com.habitrpg.android.habitica.models.user.Authentication r2 = r2.getAuthentication()
                    if (r2 == 0) goto L33
                    boolean r2 = r2.getHasPassword()
                    if (r2 != r3) goto L33
                    r2 = 1
                    goto L34
                L33:
                    r2 = 0
                L34:
                    if (r2 != 0) goto L5d
                    com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.this
                    com.habitrpg.android.habitica.databinding.DialogHabiticaAccountBinding r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.access$getBinding(r2)
                    com.google.android.material.textfield.TextInputEditText r2 = r2.confirmationInputEdittext
                    android.text.Editable r2 = r2.getText()
                    java.lang.String r2 = java.lang.String.valueOf(r2)
                    com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r5 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.this
                    android.content.Context r5 = r5.getContext()
                    if (r5 == 0) goto L56
                    r0 = 2131952068(0x7f1301c4, float:1.9540568E38)
                    java.lang.String r5 = r5.getString(r0)
                    goto L57
                L56:
                    r5 = 0
                L57:
                    boolean r2 = qc.q.d(r2, r5)
                    if (r2 != 0) goto L75
                L5d:
                    com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.this
                    com.habitrpg.android.habitica.models.user.User r2 = r2.getUser()
                    if (r2 == 0) goto L72
                    com.habitrpg.android.habitica.models.user.Authentication r2 = r2.getAuthentication()
                    if (r2 == 0) goto L72
                    boolean r2 = r2.getHasPassword()
                    if (r2 != r3) goto L72
                    goto L73
                L72:
                    r3 = 0
                L73:
                    if (r3 == 0) goto Lc1
                L75:
                    com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.this
                    com.habitrpg.android.habitica.databinding.DialogHabiticaAccountBinding r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.access$getBinding(r2)
                    android.widget.TextView r2 = r2.confirmActionTextview
                    com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r3 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.this
                    android.content.Context r3 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.access$getThisContext$p(r3)
                    r4 = 2131100575(0x7f06039f, float:1.7813535E38)
                    int r3 = androidx.core.content.a.c(r3, r4)
                    r2.setTextColor(r3)
                    com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.this
                    com.habitrpg.android.habitica.databinding.DialogHabiticaAccountBinding r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.access$getBinding(r2)
                    android.widget.TextView r2 = r2.confirmActionTextview
                    r3 = 1065353216(0x3f800000, float:1.0)
                    r2.setAlpha(r3)
                    goto Lc1
                L9b:
                    com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.this
                    com.habitrpg.android.habitica.databinding.DialogHabiticaAccountBinding r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.access$getBinding(r2)
                    android.widget.TextView r2 = r2.confirmActionTextview
                    com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r3 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.this
                    android.content.Context r3 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.access$getThisContext$p(r3)
                    r4 = 2131099868(0x7f0600dc, float:1.7812101E38)
                    int r3 = androidx.core.content.a.c(r3, r4)
                    r2.setTextColor(r3)
                    com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.this
                    com.habitrpg.android.habitica.databinding.DialogHabiticaAccountBinding r2 = com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog.access$getBinding(r2)
                    android.widget.TextView r2 = r2.confirmActionTextview
                    r3 = 1053609165(0x3ecccccd, float:0.4)
                    r2.setAlpha(r3)
                Lc1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog$setDeleteAccountViews$1.onTextChanged(java.lang.CharSequence, int, int, int):void");
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }
        });
        getBinding().confirmActionTextview.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.preferences.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabiticaAccountDialog.setDeleteAccountViews$lambda$4(HabiticaAccountDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDeleteAccountViews$lambda$4(HabiticaAccountDialog habiticaAccountDialog, View view) {
        boolean z10;
        AccountUpdateConfirmed accountUpdateConfirmed;
        String str;
        AccountUpdateConfirmed accountUpdateConfirmed2;
        Authentication authentication;
        q.i(habiticaAccountDialog, "this$0");
        String valueOf = String.valueOf(habiticaAccountDialog.getBinding().confirmationInputEdittext.getText());
        User user = habiticaAccountDialog.user;
        boolean z11 = true;
        if (user != null && (authentication = user.getAuthentication()) != null && authentication.getHasPassword()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Context context = habiticaAccountDialog.getContext();
            if (context != null) {
                str = context.getString(R.string.delete_caps);
            } else {
                str = null;
            }
            if (q.d(valueOf, str) && (accountUpdateConfirmed2 = habiticaAccountDialog.accountUpdateConfirmed) != null) {
                accountUpdateConfirmed2.deletionConfirmClicked(valueOf);
                return;
            }
            return;
        }
        if (valueOf.length() <= 0) {
            z11 = false;
        }
        if (z11 && (accountUpdateConfirmed = habiticaAccountDialog.accountUpdateConfirmed) != null) {
            accountUpdateConfirmed.deletionConfirmClicked(valueOf);
        }
    }

    private final void setResetAccountViews() {
        getBinding().titleTextview.setText(R.string.reset_account_title);
        getBinding().warningDescriptionTextview.setText(R.string.reset_account_description);
        getBinding().confirmationTextInputLayout.setHint(R.string.confirm_reset);
        getBinding().confirmationInputEdittext.setInputType(1);
        getBinding().confirmActionTextview.setText(R.string.reset_account);
        getBinding().confirmationInputEdittext.addTextChangedListener(new TextWatcher() { // from class: com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog$setResetAccountViews$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                DialogHabiticaAccountBinding binding;
                Context context;
                DialogHabiticaAccountBinding binding2;
                binding = HabiticaAccountDialog.this.getBinding();
                TextView textView = binding.confirmActionTextview;
                context = HabiticaAccountDialog.this.thisContext;
                textView.setTextColor(androidx.core.content.a.c(context, R.color.gray_300));
                binding2 = HabiticaAccountDialog.this.getBinding();
                binding2.confirmActionTextview.setAlpha(0.4f);
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                DialogHabiticaAccountBinding binding;
                String str;
                DialogHabiticaAccountBinding binding2;
                Context context;
                DialogHabiticaAccountBinding binding3;
                DialogHabiticaAccountBinding binding4;
                Context context2;
                DialogHabiticaAccountBinding binding5;
                binding = HabiticaAccountDialog.this.getBinding();
                String valueOf = String.valueOf(binding.confirmationInputEdittext.getText());
                Context context3 = HabiticaAccountDialog.this.getContext();
                if (context3 != null) {
                    str = context3.getString(R.string.reset_caps);
                } else {
                    str = null;
                }
                if (q.d(valueOf, str)) {
                    binding4 = HabiticaAccountDialog.this.getBinding();
                    TextView textView = binding4.confirmActionTextview;
                    context2 = HabiticaAccountDialog.this.thisContext;
                    textView.setTextColor(androidx.core.content.a.c(context2, R.color.red_100));
                    binding5 = HabiticaAccountDialog.this.getBinding();
                    binding5.confirmActionTextview.setAlpha(1.0f);
                    return;
                }
                binding2 = HabiticaAccountDialog.this.getBinding();
                TextView textView2 = binding2.confirmActionTextview;
                context = HabiticaAccountDialog.this.thisContext;
                textView2.setTextColor(androidx.core.content.a.c(context, R.color.gray_300));
                binding3 = HabiticaAccountDialog.this.getBinding();
                binding3.confirmActionTextview.setAlpha(0.4f);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }
        });
        getBinding().confirmActionTextview.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.preferences.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabiticaAccountDialog.setResetAccountViews$lambda$3(HabiticaAccountDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setResetAccountViews$lambda$3(HabiticaAccountDialog habiticaAccountDialog, View view) {
        String str;
        AccountUpdateConfirmed accountUpdateConfirmed;
        q.i(habiticaAccountDialog, "this$0");
        String valueOf = String.valueOf(habiticaAccountDialog.getBinding().confirmationInputEdittext.getText());
        Context context = habiticaAccountDialog.getContext();
        if (context != null) {
            str = context.getString(R.string.reset_caps);
        } else {
            str = null;
        }
        if (q.d(valueOf, str) && (accountUpdateConfirmed = habiticaAccountDialog.accountUpdateConfirmed) != null) {
            accountUpdateConfirmed.resetConfirmedClicked();
        }
    }

    public final String getAccountAction() {
        return this.accountAction;
    }

    public final AccountUpdateConfirmed getAccountUpdateConfirmed() {
        return this.accountUpdateConfirmed;
    }

    @Override // androidx.fragment.app.k
    public int getTheme() {
        return R.style.HabiticaAlertDialogTheme;
    }

    public final User getUser() {
        return this.user;
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.HabiticaAlertDialogTheme);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.y, androidx.fragment.app.k
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        q.g(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) onCreateDialog;
        aVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.habitrpg.android.habitica.ui.fragments.preferences.d
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HabiticaAccountDialog.onCreateDialog$lambda$2(dialogInterface);
            }
        });
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        this._binding = DialogHabiticaAccountBinding.inflate(getLayoutInflater());
        MaterialCardView root = getBinding().getRoot();
        q.h(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o2 P;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        if (getActivity() != null && (P = p0.P(view)) != null) {
            P.d(true);
        }
        String str = this.accountAction;
        if (q.d(str, "reset_account")) {
            setResetAccountViews();
        } else if (q.d(str, "delete_account")) {
            setDeleteAccountViews();
        }
        getBinding().backImagebutton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.preferences.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HabiticaAccountDialog.onViewCreated$lambda$1(HabiticaAccountDialog.this, view2);
            }
        });
    }

    public final void setAccountAction(String str) {
        this.accountAction = str;
    }

    public final void setAccountUpdateConfirmed(AccountUpdateConfirmed accountUpdateConfirmed) {
        this.accountUpdateConfirmed = accountUpdateConfirmed;
    }

    public final void setUser(User user) {
        this.user = user;
    }
}
