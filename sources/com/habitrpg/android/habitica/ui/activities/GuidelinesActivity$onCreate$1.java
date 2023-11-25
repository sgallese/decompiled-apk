package com.habitrpg.android.habitica.ui.activities;

import android.view.View;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: GuidelinesActivity.kt */
/* loaded from: classes4.dex */
public final class GuidelinesActivity$onCreate$1 implements Callback {
    final /* synthetic */ GuidelinesActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GuidelinesActivity$onCreate$1(GuidelinesActivity guidelinesActivity) {
        this.this$0 = guidelinesActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResponse$lambda$0(GuidelinesActivity guidelinesActivity, String str) {
        qc.q.i(guidelinesActivity, "this$0");
        qc.q.i(str, "$text");
        View findViewById = guidelinesActivity.findViewById(R.id.text_view);
        qc.q.h(findViewById, "findViewById(...)");
        MarkdownParserKt.setMarkdown((TextView) findViewById, str);
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        qc.q.i(call, "call");
        qc.q.i(iOException, "e");
        ExceptionHandler.Companion.reportError(iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) throws IOException {
        InputStream inputStream;
        qc.q.i(call, "call");
        qc.q.i(response, "response");
        ResponseBody body = response.body();
        if (body != null) {
            inputStream = body.byteStream();
        } else {
            inputStream = null;
        }
        final String c10 = nc.h.c(new BufferedReader(new InputStreamReader(inputStream)));
        ResponseBody body2 = response.body();
        if (body2 != null) {
            body2.close();
        }
        TextView textView = (TextView) this.this$0.findViewById(R.id.text_view);
        final GuidelinesActivity guidelinesActivity = this.this$0;
        textView.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.activities.x0
            @Override // java.lang.Runnable
            public final void run() {
                GuidelinesActivity$onCreate$1.onResponse$lambda$0(GuidelinesActivity.this, c10);
            }
        });
    }
}
