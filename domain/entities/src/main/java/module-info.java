module myproduct.domain.entities {
    requires static lombok;
    requires static com.github.spotbugs.annotations;
    exports com.example.domain.dto;
    exports com.example.domain.entity;
}