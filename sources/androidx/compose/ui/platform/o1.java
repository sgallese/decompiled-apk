package androidx.compose.ui.platform;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;

/* compiled from: InvertMatrix.kt */
/* loaded from: classes.dex */
public final class o1 {
    public static final boolean a(float[] fArr, float[] fArr2) {
        boolean z10;
        qc.q.i(fArr, "$this$invertTo");
        qc.q.i(fArr2, TaskSetupFragment.TYPE_OTHER);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (((((f26 * f37) - (f27 * f36)) + (f28 * f35)) + (f29 * f34)) - (f30 * f33)) + (f31 * f32);
        if (f38 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        float f39 = 1.0f / f38;
        fArr2[0] = (((f15 * f37) - (f16 * f36)) + (f17 * f35)) * f39;
        fArr2[1] = ((((-f11) * f37) + (f12 * f36)) - (f13 * f35)) * f39;
        fArr2[2] = (((f23 * f31) - (f24 * f30)) + (f25 * f29)) * f39;
        fArr2[3] = ((((-f19) * f31) + (f20 * f30)) - (f21 * f29)) * f39;
        float f40 = -f14;
        fArr2[4] = (((f40 * f37) + (f16 * f34)) - (f17 * f33)) * f39;
        fArr2[5] = (((f37 * f10) - (f12 * f34)) + (f13 * f33)) * f39;
        float f41 = -f22;
        fArr2[6] = (((f41 * f31) + (f24 * f28)) - (f25 * f27)) * f39;
        fArr2[7] = (((f31 * f18) - (f20 * f28)) + (f21 * f27)) * f39;
        fArr2[8] = (((f14 * f36) - (f15 * f34)) + (f17 * f32)) * f39;
        fArr2[9] = ((((-f10) * f36) + (f34 * f11)) - (f13 * f32)) * f39;
        fArr2[10] = (((f22 * f30) - (f23 * f28)) + (f25 * f26)) * f39;
        fArr2[11] = ((((-f18) * f30) + (f28 * f19)) - (f21 * f26)) * f39;
        fArr2[12] = (((f40 * f35) + (f15 * f33)) - (f16 * f32)) * f39;
        fArr2[13] = (((f10 * f35) - (f11 * f33)) + (f12 * f32)) * f39;
        fArr2[14] = (((f41 * f29) + (f23 * f27)) - (f24 * f26)) * f39;
        fArr2[15] = (((f18 * f29) - (f19 * f27)) + (f20 * f26)) * f39;
        return true;
    }
}
