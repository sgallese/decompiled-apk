package com.habitrpg.android.habitica.ui.views.insufficientCurrency;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import qc.q;

/* compiled from: InsufficientCurrencyDialog.kt */
/* loaded from: classes4.dex */
public abstract class InsufficientCurrencyDialog extends HabiticaAlertDialog {
    public static final int $stable = 8;
    protected ImageView imageView;
    protected TextView textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsufficientCurrencyDialog(Context context) {
        super(context);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ImageView getImageView() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            return imageView;
        }
        q.z("imageView");
        return null;
    }

    public int getLayoutID() {
        return R.layout.dialog_insufficient_currency;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getTextView() {
        TextView textView = this.textView;
        if (textView != null) {
            return textView;
        }
        q.z("textView");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(getContext()).inflate(getLayoutID(), (ViewGroup) null);
        setAdditionalContentView(inflate);
        View findViewById = inflate.findViewById(R.id.imageView);
        q.h(findViewById, "findViewById(...)");
        setImageView((ImageView) findViewById);
        View findViewById2 = inflate.findViewById(R.id.textView);
        q.h(findViewById2, "findViewById(...)");
        setTextView((TextView) findViewById2);
    }

    protected final void setImageView(ImageView imageView) {
        q.i(imageView, "<set-?>");
        this.imageView = imageView;
    }

    protected final void setTextView(TextView textView) {
        q.i(textView, "<set-?>");
        this.textView = textView;
    }
}
