package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.FigureMoveDto;

public interface ChessService {
    Boolean isMoveCorrect(FigureMoveDto figureMoveDto);
}
