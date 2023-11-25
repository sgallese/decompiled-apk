package w1;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* compiled from: StaticLayoutFactory.kt */
/* loaded from: classes.dex */
final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f25293a = new n0();

    private n0() {
    }

    public static final boolean a(StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        qc.q.i(staticLayout, "layout");
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final void b(StaticLayout.Builder builder, int i10, int i11) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        qc.q.i(builder, "builder");
        lineBreakStyle = m0.a().setLineBreakStyle(i10);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i11);
        build = lineBreakWordStyle.build();
        qc.q.h(build, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(build);
    }
}
