package com.example.usefresco;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 在自己想要开始调试的地方start
        //Debug.startMethodTracing("UseFresco");
        ProgressiveJpegConfig config = new ProgressiveJpegConfig() {
            @Override
            public int getNextScanNumberToDecode(int i) {
                return 0;
            }

            @Override
            public QualityInfo getQualityInfo(int i) {
                return null;
            }
        };

        ImagePipelineConfig imagePipelineConfig = ImagePipelineConfig.newBuilder(this)
                .setProgressiveJpegConfig(config)
                .build();
        Fresco.initialize(getApplicationContext(),imagePipelineConfig);

        //Fresco.initialize(this);
        setContentView(R.layout.activity_main);

        SimpleDraweeView imageView = (SimpleDraweeView) findViewById(R.id.image_view);
        Uri uri = Uri.parse("http://www.sucaijiayuan.com/uploads/file/contents/2014/04/534a9b6b20fab.jpg");
//        ControllerListener listener = new BaseControllerListener(){
//            @Override
//            public void onFinalImageSet(String id, Object imageInfo, Animatable animatable) {
//                Log.d(TAG, "onFinalImageSet");
//                super.onFinalImageSet(id, imageInfo, animatable);
//            }
//
//            @Override
//            public void onFailure(String id, Throwable throwable) {
//                Log.d(TAG, "onFailure");
//                super.onFailure(id, throwable);
//            }
//
//            @Override
//            public void onIntermediateImageFailed(String id, Throwable throwable) {
//                Log.d(TAG, "onIntermediateImageFailed");
//                super.onIntermediateImageFailed(id, throwable);
//            }
//        };
//        DraweeController controller = Fresco.newDraweeControllerBuilder()
//                .setUri(uri)
//                .setControllerListener(listener)
//                .build();
        // imageView.setController(controller);

        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(uri)
                .setProgressiveRenderingEnabled(true)
                .build();
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .build();
        imageView.setController(controller);



//        GenericDraweeHierarchy hierarchy = new GenericDraweeHierarchyBuilder(getResources())
//                .setFadeDuration(300)
//                .setBackground(getDrawable(R.mipmap.ic_launcher))
//                .setPlaceholderImage(getDrawable(R.mipmap.ic_launcher))
//                .setFailureImage(getDrawable(R.mipmap.ic_launcher))
//                .build();
//        imageView.setHierarchy(hierarchy);

        // 在合适的地方stop
     //   Debug.stopMethodTracing();
    }
}
