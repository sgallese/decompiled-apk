package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.z;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.s;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.v;
import l7.a;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends z {
    @Override // androidx.appcompat.app.z
    protected d c(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // androidx.appcompat.app.z
    protected AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.z
    protected f e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.z
    protected s k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.z
    protected b0 o(Context context, AttributeSet attributeSet) {
        return new r7.a(context, attributeSet);
    }
}
