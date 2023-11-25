package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: classes3.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: t  reason: collision with root package name */
    private final Rect f10458t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f10459u;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.f24648r);
    }

    private String e(TextInputLayout textInputLayout) {
        String str;
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z10 = !TextUtils.isEmpty(text);
        String str2 = "";
        if ((!TextUtils.isEmpty(hint)) == false) {
            str = "";
        } else {
            str = hint.toString();
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) text);
            if (!TextUtils.isEmpty(str)) {
                str2 = ", " + str;
            }
            sb2.append(str2);
            return sb2.toString();
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            return str;
        }
    }

    private boolean f(TextInputLayout textInputLayout) {
        if (textInputLayout != null && this.f10459u) {
            return true;
        }
        return false;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (f(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.f10458t);
            rect.bottom = this.f10458t.bottom;
        }
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (f(textInputLayout)) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.P()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.P() && super.getHint() == null && com.google.android.material.internal.i.a()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText(e(textInputLayout));
        }
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (f(textInputLayout) && rect != null) {
            this.f10458t.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.f10458t);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f10459u = z10;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i10) {
        super(s7.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f10458t = new Rect();
        TypedArray i11 = com.google.android.material.internal.p.i(context, attributeSet, v6.l.f24945m7, i10, v6.k.f24804n, new int[0]);
        setTextInputLayoutFocusedRectEnabled(i11.getBoolean(v6.l.f24955n7, false));
        i11.recycle();
    }
}
